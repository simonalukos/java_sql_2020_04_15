package com.kcs.students.app.service;

import com.kcs.students.app.dto.Student;
import com.kcs.students.app.dto.StudentAddress;
import com.kcs.students.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentAddressService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentAddress> getStudentAddress() {
        String sql = "SELECT * FROM student_address";
        return getStudentAddresses(sql, null);
    }

    public List<StudentAddress> getStudentAddresses(int studentId) {
        String sql = "SELECT * FROM student_address where studentId = ?";
        return getStudentAddresses(sql, studentId);
    }

    private List<StudentAddress> getStudentAddresses(String sql, Integer studentId){
        List<StudentAddress> studentAddresses = new ArrayList<>();

        PreparedStatement preparedStatement = studentRepository.getPreparedStatement(sql);
        if(preparedStatement != null){
            try {
                if(studentId != null){
                    preparedStatement.setInt(1, studentId);
                }
                ResultSet resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
                    studentAddresses.add(new StudentAddress(resultSet.getInt("id"),
                            resultSet.getInt("studentId"),
                            resultSet.getString("country"),
                            resultSet.getString("city"),
                            resultSet.getString("street"),
                            resultSet.getString("postCode")));
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return studentAddresses;
    }
    public List<StudentAddress> createStudentAddress(StudentAddress studentAddress) {
        PreparedStatement preparedStatement = studentRepository.getPreparedStatement("insert into student_address(studentId, country, city, street, postCode)values(?,?,?,?,?)");
        if (preparedStatement != null) {
        }
        try{
            preparedStatement.setInt(1, studentAddress.getStudentId());
            preparedStatement.setString(2, studentAddress.getCountry());
            preparedStatement.setString(3, studentAddress.getCity());
            preparedStatement.setString(4, studentAddress.getStreet());
            preparedStatement.setString(5, studentAddress.getPostcode());

            preparedStatement.execute();
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return getStudentAddresses("SELECT * from student_address where studentId = ?", studentAddress.getStudentId());
    }
    public void deleteStudentAddress(int studentId, int addressId){
        PreparedStatement preparedStatement = studentRepository.getPreparedStatement("DELETE FROM student_address where studentId = ? and id = ?");
        if(preparedStatement == null){
            return;
        }
        try {
            preparedStatement.setInt(1, studentId);
            preparedStatement.setInt(2, addressId);
            preparedStatement.execute();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
