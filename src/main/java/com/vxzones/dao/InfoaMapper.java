package com.vxzones.dao;

import java.util.List;
import org.apache.ibatis.annotations.*;
import com.vxzones.pojo.InfoA;

public interface InfoaMapper {
	@Select("select * from info_a")
	@Results({
            @Result(property = "infoId", column = "uid"),
			@Result(property = "title", column = "title"),
			@Result(property = "authors", column = "authors"), 
			@Result(property = "affiliation", column = "affiliation"),
			@Result(property = "abstracts", column = "abstract"),
			@Result(property = "keyWords", column = "keywords"),
			@Result(property = "oralPoster", column = "oral_poster"),
			@Result(property = "email", column = "email")})
	public List<InfoA> queryList();
    @Select("SELECT * FROM info_a WHERE uid = #{infoId}")
    @Results({
	    	@Result(property = "infoId", column = "uid"),
			@Result(property = "title", column = "title"),
			@Result(property = "authors", column = "authors"), 
			@Result(property = "affiliation", column = "affiliation"),
			@Result(property = "abstracts", column = "abstract"),
			@Result(property = "keyWords", column = "keywords"),
			@Result(property = "oralPoster", column = "oral_poster"),
			@Result(property = "email", column = "email")})
    InfoA findById(int infoId);
    
    @Insert("insert into info_a(title,authors,affiliation,abstract,keywords,oral_poster,email) values (#{title},#{authors},#{affiliation},#{abstracts},#{keyWords},#{oralPoster},#{email})")
    int saveInfoa(InfoA infoA);
 
}
