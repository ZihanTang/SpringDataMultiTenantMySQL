package com.zhtangsh.SpringDataMultiTenantMySQL.data;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2018/12/11
 */
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}