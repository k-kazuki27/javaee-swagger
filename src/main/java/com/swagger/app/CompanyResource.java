/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swagger.app;

import com.google.common.collect.Lists;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author kazuki
 */
@Api(tags = {"company"})
@Path("company")
public class CompanyResource {
    
    @ApiOperation(value = "会社検索API",
            notes = "全会社を取得します",
            response = Company.class, responseContainer = "List")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Company> findAll() {
        Company company = new Company();
        company.setName("株式会社");
        return Lists.newArrayList(company);
    }
    
    @ApiOperation(value = "会社検索API",
            notes = "1会社を取得します",
            response = Company.class)
    @GET
    @javax.ws.rs.Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Company find(@ApiParam(value = "id", required = true) @PathParam("id") Integer id) {
        return new Company();
    }
    
    @ApiOperation(value = "会社登録API",
            notes = "会社を新規登録します",
            response = Company.class)
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Company create(@ApiParam(value = "会社", required = true) Company entity)  {
        return new Company();
    }
    
    @ApiOperation(value = "会社更新API",
            notes = "会社を更新します")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit( @ApiParam(value = "会社", required = true) Company entity)  {
        
    }
    @ApiOperation(value = "会社削除API",
            notes = "会社を削除します")
    @DELETE
    @javax.ws.rs.Path("{id}")
    public void remove(@ApiParam(value = "id", required = true) @PathParam("id") Integer id)  {
        
    }
    
}
