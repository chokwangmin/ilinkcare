package com.example.ilinkcare.service;

import com.example.ilinkcare.domain.Child;
import com.example.ilinkcare.domain.Order;

import java.util.List;

public interface ChildService {

    void ChildCreate (Child child);
    List<Child> ChildInfo (int parentNo);
}
