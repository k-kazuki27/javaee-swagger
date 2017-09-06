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
@Api(tags = {"user"})
@Path("user")
public class UserResource {
    
    @ApiOperation(value = "ユーザ検索API",
            notes = "全ユーザを取得します",
            response = User.class, responseContainer = "List")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> findAll() {
        User user = new User();
        user.setUserId("A001");
        user.setName("田中太郎");
        user.setAge(20);
        return Lists.newArrayList(user);
    }
    
    @ApiOperation(value = "ユーザ検索API",
            notes = "1ユーザを取得します",
            response = User.class)
    @GET
    @javax.ws.rs.Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User find(@ApiParam(value = "id", required = true) @PathParam("id") Integer id) {
        return new User();
    }
    
    @ApiOperation(value = "ユーザ登録API",
            notes = "ユーザを新規登録します",
            response = User.class)
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User create(@ApiParam(value = "ユーザ", required = true) User entity)  {
        return new User();
    }
    
    @ApiOperation(value = "ユーザ更新API",
            notes = "ユーザを更新します")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit( @ApiParam(value = "ユーザ", required = true) User entity)  {
        
    }
    @ApiOperation(value = "ユーザ削除API",
            notes = "ユーザを削除します")
    @DELETE
    @javax.ws.rs.Path("{id}")
    public void remove(@ApiParam(value = "id", required = true) @PathParam("id") Integer id)  {
        
    }
}
