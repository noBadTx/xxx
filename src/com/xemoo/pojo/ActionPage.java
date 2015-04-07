package com.xemoo.pojo;

import java.util.Collections;
import java.util.List;

/**
 * 分页控件
 * 
 * @author xujunjie
 */
public class ActionPage<E>
{

    @SuppressWarnings("unchecked")
    private static final ActionPage EMPTY_PAGE = new ActionPage();

    @SuppressWarnings("unchecked")
    public static final <E> ActionPage<E> emptyPage()
    {
        return (ActionPage<E>) EMPTY_PAGE;
    }

    /**
     * 当前页展示的数据
     */
    private List<E> rows = Collections.emptyList();

    /**
     * 总共页数
     */
    private int totalPage;

    private int total;

    /** 偏移量 */
    private int offset;

    /**
     * 当前页
     */
    private int currentPage = 1;

    /**
     * 一页显示的条数
     */
    private int pageNum = 10;

    private String pageHtml = "";

    public String getPageHtml()
    {
        return pageHtml;
    }

    public List<E> getRows()
    {
        return rows;
    }

    public void setRows(List<E> list)
    {
        this.rows = list;
    }

    public int getTotalPage()
    {
        totalPage = total % pageNum > 0 ? total / pageNum + 1 : total / pageNum;
        return totalPage;
    }

    public void setTotalPage(int totalPage)
    {
        this.totalPage = totalPage;
    }

    public int getCurrentPage()
    {
        if (currentPage > totalPage)
        {
            currentPage = totalPage;
        }
        else if (currentPage < 1)
        {
            currentPage = 1;
        }

        return currentPage;
    }

    public int getCurPage()
    {
        if (currentPage < 1)
        {
            currentPage = 1;
        }
        return currentPage;
    }

    public void setCurrentPage(int currentPage)
    {
        if (currentPage < 1)
        {
            currentPage = 1;
        }
        this.currentPage = currentPage;
    }

    public int getPageNum()
    {
        return pageNum;
    }

    public void setPageNum(int pageNum)
    {
        this.pageNum = pageNum;
    }

    public DaoPage builderDaoPage()
    {
        DaoPage page = new DaoPage();

        page.setCount(this.pageNum);
        if (totalPage > 0 && currentPage > totalPage)
        {
            currentPage = totalPage;
        }
        else if (currentPage < 1)
        {
            currentPage = 1;
        }
        page.setStart((this.currentPage - 1) * this.pageNum + offset);
        return page;
    }

    public int getStart()
    {

        int start = builderDaoPage().getStart();
        if (start <= total)
        {
            return start;
        }
        else
        {
            start = total - pageNum;
            return start;
        }
    }

    public void setTotal(int totalCount)
    {
        this.total = totalCount;
        int result = totalCount / pageNum;
        totalPage = (totalCount % pageNum) == 0 ? result : result + 1;
    }

    public int getTotal()
    {
        return total;
    }

    public int getOffset()
    {
        return offset;
    }

    public void setOffset(int offset)
    {
        this.offset = offset;
    }

}
