package com.vxzones.dao;

import java.util.List;
import org.apache.ibatis.annotations.*;
import com.vxzones.pojo.InfoR;

public interface InforMapper {
	@Select("select * from info_r")
	@Results({
            @Result(property = "infoUid", column = "uid"),
			@Result(property = "firstName", column = "firstname"),
			@Result(property = "middleName", column = "middlename"), 
			@Result(property = "lastName", column = "lastname"),
			@Result(property = "gender", column = "gender"),
			@Result(property = "country", column = "country"),
			@Result(property = "jobTitle", column = "jobtitle"),
			@Result(property = "institution", column = "institution"), 
			@Result(property = "address", column = "address"),
			@Result(property = "email", column = "email"),
			@Result(property = "phoneNum", column = "phonenum"),
//			@Result(property = "hotel", column = "hotel"),
//			@Result(property = "special", column = "special"),
			@Result(property = "specialFood", column = "specialfood"),
			@Result(property = "stuName", column = "stu_name"),
			@Result(property = "stuInstitution", column = "stu_institution"),
			@Result(property = "stuEmail", column = "stu_email")})
	public List<InfoR> queryList();
    @Select("SELECT * FROM info_r WHERE uid = #{infoUid}")
    @Results({
    	@Result(property = "infoUid", column = "uid"),
		@Result(property = "firstName", column = "firstname"),
		@Result(property = "middleName", column = "middlename"), 
		@Result(property = "lastName", column = "lastname"),
		@Result(property = "gender", column = "gender"),
		@Result(property = "country", column = "country"),
		@Result(property = "jobTitle", column = "jobtitle"),
		@Result(property = "institution", column = "institution"), 
		@Result(property = "address", column = "address"),
		@Result(property = "email", column = "email"),
		@Result(property = "phoneNum", column = "phonenum"),
//		@Result(property = "hotel", column = "hotel"),
//		@Result(property = "special", column = "special"),
		@Result(property = "specialFood", column = "specialfood"),
		@Result(property = "stuName", column = "stu_name"),
		@Result(property = "stuInstitution", column = "stu_institution"),
		@Result(property = "stuEmail", column = "stu_email") })
    
    InfoR findById(int infoUid);
    
    @Insert("insert into info_r(firstname,middlename,lastname,gender,country,jobtitle,institution,address,email,phonenum,specialfood,stu_name,stu_institution,stu_email) values (#{firstName},#{middleName},#{lastName},#{gender},#{country},#{jobTitle},#{institution},#{address},#{email},#{phoneNum},#{specialFood},#{stuName},#{stuInstitution},#{stuEmail})")
    int saveInfor(InfoR infoR);
}
