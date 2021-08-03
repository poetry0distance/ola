package com.demo.service;

import org.springframework.stereotype.Service;

/**
 * <p>Title: EMP </p>
 *
 * @author wang tao
 * @version 1.0-SNAPSHOT
 * @date 2021-01-29
 */
@Service
public class OlaService {



//    DirectByteBuffer(int cap) {
//        //package-private
//        super(-1, 0, cap, cap);
//        boolean pa = VM.isDirectMemoryPageAligned();
//        int ps = Bits.pageSize();
//        long size = Math.max(1L, (long)cap + (pa ? ps : 0));
//        Bits.reserveMemory(size, cap);
//        long base = 0;
//        try{
//            base = unsafe.allocateMemory(size); //分配直接内存
//        }catch (OutOfMemoryError x) {
//            Bits.unreserveMemory(size, cap);
//            throw x;
//        }
//        unsafe.setMemory(base, size, (byte) 0);
//        if (pa && (base % ps != 0)) {
//            Round up to page boundary address = base + ps - (base & (ps - 1));
//        } else {
//            address = base;
//        }
//        /* cleaner对象用来释放直接内存，
//        cleaner对象关联了当前的ByteBuffer对象，
//        因为ByteBuffer对象是受java虚拟机管理的，
//        直接内存不受java虚拟机管理，所以这里的关联，
//        就是为了在当ByteBuffer被释放的时候，直接内存也被释放，
//        只不过是被unsafe对象释放的，并不是Java虚拟机释放的。
//        */
//        cleaner = Cleaner.create(this, new Deallocator(base, size, cap));
//        // 释放直接内存
//        att = null;
//    }
}
