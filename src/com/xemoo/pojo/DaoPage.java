package com.xemoo.pojo;

public class DaoPage
{

    /**
     * 开始条数
     */
    private int start = 0;

    /**
     * 结束条数
     */
    private int count = 10;

    public DaoPage()
    {
    }

    public DaoPage(int start, int count)
    {
        this.start = start;
        this.count = count;
    }

    public int getStart()
    {
        return start;
    }

    public void setStart(int start)
    {
        this.start = start;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + count;
        result = prime * result + start;
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DaoPage other = (DaoPage) obj;
        if (count != other.count)
            return false;
        if (start != other.start)
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "DaoPage [count=" + count + ", start=" + start + "]";
    }

}
