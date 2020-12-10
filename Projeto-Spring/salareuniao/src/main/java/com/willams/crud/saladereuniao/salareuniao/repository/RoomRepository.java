package com.willams.crud.saladereuniao.salareuniao.repository;

import com.willams.crud.saladereuniao.salareuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{

}
