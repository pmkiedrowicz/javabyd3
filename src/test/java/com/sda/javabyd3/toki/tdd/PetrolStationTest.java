//package com.sda.javabyd3.toki.tdd;
//
//import org.junit.Test;
//
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
//
//public class PetrolStationTest {
//
//    @Test
//    public void shouldFillUpCarTankIfEmpty() {
//
//        //given
//        Tank tank = new Tank(0, 60);
//        PetrolStation petrolStation = new PetrolStation();
//
//        //when
//        petrolStation.fillTankFull(tank);
//
//        //then
//        assertTrue(tank.isFull());
//
//    }
//
//    @Test
//    public void shouldFillUpCarTankIfHalfFull() {
//
//        //given
//        Tank tank = new Tank(30, 60);
//        PetrolStation petrolStation = new PetrolStation();
//
//        //when
//        petrolStation.fillTankFull(tank);
//
//        //then
//        assertTrue(tank.isFull());
//    }
//
//    @Test
//    public void shouldFillUpCarTankIfFull() {
//
//        //given
//        Tank tank = new Tank(60, 60);
//        PetrolStation petrolStation = new PetrolStation();
//
//        //when
//        petrolStation.fillTankFull(tank);
//
//        //then
//        assertTrue(tank.isFull());
//    }
//
//    @Test
//    public void shouldFillUpCarToUserValue() {
//
//        //given
//        Tank tank = new Tank(10, 60);
//        PetrolStation petrolStation = new PetrolStation();
//
//        //when
//        petrolStation.fillTank(tank, 40);
//
//        //then
//        assertTrue(tank.tankUserValue());
//    }
//
//    @Test
//    public void shouldFillUpCarToUserValueIfItsOverFilled() {
//
//        //given
//        Tank tank = new Tank(20, 60);
//        PetrolStation petrolStation = new PetrolStation();
//
//        //when
//        petrolStation.fillTank(tank, 41);
//
//        //then
//        assertFalse(tank.tankUserValue());
//    }
//
//    @Test
//    public void shouldCheckPetrolStationBigTank() {
//
//        //given
//        PetrolTank petrolTank = new PetrolTank();
//
//        //when
//        boolean tank = petrolTank.petrolTank(30, 20);
//        boolean tank2 = petrolTank.petrolTank(30, 40);
//
//        //then
//        assertFalse(tank);
//        assertTrue(tank2);
//
//    }
//}