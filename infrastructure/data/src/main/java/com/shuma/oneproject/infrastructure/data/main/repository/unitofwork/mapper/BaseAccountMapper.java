package com.shuma.oneproject.infrastructure.data.main.repository.unitofwork.mapper;

import com.shuma.oneproject.infrastructure.data.main.repository.unitofwork.model.AccountDO;
import com.shuma.oneproject.infrastructure.data.main.repository.unitofwork.model.AccountDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    long countByExample(AccountDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    int deleteByExample(AccountDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    int insert(AccountDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    int insertSelective(AccountDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    List<AccountDO> selectByExample(AccountDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    AccountDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    int updateByExampleSelective(@Param("record") AccountDO record, @Param("example") AccountDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    int updateByExample(@Param("record") AccountDO record, @Param("example") AccountDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    int updateByPrimaryKeySelective(AccountDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_account
     *
     * @mbg.generated Fri May 10 18:34:58 CST 2019
     */
    int updateByPrimaryKey(AccountDO record);
}