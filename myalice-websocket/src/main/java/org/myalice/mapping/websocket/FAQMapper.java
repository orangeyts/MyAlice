package org.myalice.mapping.websocket;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
import org.myalice.domain.websocket.FAQ;

public interface FAQMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table faq
     *
     * @mbg.generated
     */
    @Delete({
        "delete from faq",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table faq
     *
     * @mbg.generated
     */
    @Insert({
        "insert into faq (id, summary, ",
        "url, status, remarks)",
        "values (#{id,jdbcType=INTEGER}, #{summary,jdbcType=VARCHAR}, ",
        "#{url,jdbcType=VARCHAR}, #{status,jdbcType=CHAR}, #{remarks,jdbcType=VARCHAR})"
    })
    int insert(FAQ record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table faq
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, summary, url, status, remarks",
        "from faq",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="summary", property="summary", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR)
    })
    FAQ selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table faq
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, summary, url, status, remarks",
        "from faq"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="summary", property="summary", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR)
    })
    List<FAQ> selectAll();
    
    @Select({
        "select",
        "id, summary, url, status, remarks",
        "from faq where status = '0'"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="summary", property="summary", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR)
    })
    List<FAQ> selectValid();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table faq
     *
     * @mbg.generated
     */
    @Update({
        "update faq",
        "set summary = #{summary,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=CHAR},",
          "remarks = #{remarks,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FAQ record);
}