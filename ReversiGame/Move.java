public class Move
{
    private int row;
    private int col;
    private int value; // corresponds to the colour of the player Black(-1) or White(1) and other times it is used to store the value returned from the evaluation function
    

    Move()
    {
        this.row = -1;
        this.col = -1;
        this.value = 0;
    }

    Move(int row, int col)
    {
        this.row = row;
        this.col = col;
        this.value = -1;
    }

    Move(int value)
    {
        this.row = -1;
        this.col = -1;
        this.value = value;
    }

    Move(int row, int col, int value)
    {
        this.row = row;
        this.col = col;
        this.value = value;
    }

    int getRow()
    {
        return this.row;
    }

    int getCol()
    {
        return this.col;
    }

    int getValue()
    {
        return this.value;
    }

    void setRow(int row)
    {
        this.row = row;
    }

    void setCol(int col)
    {
        this.col = col;
    }

    void setValue(int value)
    {
        this.value = value;
    }
}
