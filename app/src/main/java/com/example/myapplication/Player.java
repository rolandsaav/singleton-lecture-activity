package com.example.myapplication;

public class Player {

    private static double x;
    private static double y;
    private static double movementSpeed;

    // TODO: Instance should be named "player"
    private static Player player;

    /*
     * TODO: Constructor for Player
     * @param x x-coordinate of player (default 0.0)
     * @param y y-coordinate of player (default 0.0)
     * @param movementSpeed movement speed of player (default 5.0)
     */
    private Player(double x, double y, double m) {
        this.x = x;
        this.y = y;
        this.movementSpeed = m;
    }

    /*
     * TODO: Returns the instance of the player
     * Name: getPlayer()
     * @return the instance of the player
     */
    public static Player getPlayer() {
        if (player == null) {
            player = new Player(0, 0, 5.0);
        }
        return player;
    }

    public void moveUp() {
        setY(Math.max(0, getY() - movementSpeed));
    }

    public void moveDown() {
        setY(Math.min(getY() + movementSpeed, 720));
    }

    public void moveLeft() {
        setX(Math.max(0, getX() - movementSpeed));
    }

    public void moveRight() {
        setX(Math.min(getX() + movementSpeed, 720));
    }

    public double getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
}
