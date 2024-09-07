package org.javacore.DAO;

import org.javacore.Domain.Luong;

public interface LuongService extends CRUD<Luong> {

    Double AvgSalary();
}
