package com.zhtangsh.SpringDataMultiTenantMySQL;

import com.zhtangsh.SpringDataMultiTenantMySQL.tenant.repository.CompanyRepository;
import com.zhtangsh.SpringDataMultiTenantMySQL.tenant.repository.CurrencyRepository;
import com.zhtangsh.SpringDataMultiTenantMySQL.tenant.repository.UserRepository;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Created by Zihan Eric Tang(mrzihan.tang@gmail.com) on 2018/12/10
 */
@Named
@Produces(MediaType.APPLICATION_JSON)
@Path("test")
public class SipleEndpoint {
    @Inject
    private UserRepository userRepository;

    @Inject
    private CompanyRepository companyRepository;

    @Inject
    private CurrencyRepository currencyRepository;

    @GET
    @Path("user")
    public Response getUsers() {
        currencyRepository.findAll();
        return Response.ok(this.userRepository.findAll()).build();
    }

    @GET
    @Path("company")
    public Response getCompanies() {
        return Response.ok(this.companyRepository.findAll()).build();
    }
}
