package work_with_my_sql;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBC {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world",
                "root",
                "mysqlroot");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from city where city.CountryCode =?");
        preparedStatement.setString(1,"UKR");
        ResultSet resultSet = preparedStatement.executeQuery();

        List<JDBCCity> jdbcCities = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String countryCode = resultSet.getString("CountryCode");
            String district = resultSet.getString("District");
            int population = resultSet.getInt("Population");
            jdbcCities.add(new JDBCCity(id,name, countryCode, district,population));
        }
        jdbcCities.stream().forEach(System.out::println);
        //jdbcCities.stream().filter(jdbcCity -> jdbcCity.getCountryCode().equals("UKR")).forEach(System.out::println);

        connection.close();
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
class JDBCCity {
    int id ;

    String name;

    String countryCode;

    String district;

    int population;

}
