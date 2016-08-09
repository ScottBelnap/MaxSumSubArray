package com.agoda.max;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sbelnap on 8/9/2016.
 */
public class SumSubsetUnitTest {

    @Test
    public void testSubArrayFrontSlow(){
        int arr[] = new int[]{1, 2, 3, -5};
        Assert.assertEquals(6, Subset.sumSlow(arr));
    }

    @Test
    public void testSubArrayFrontMid(){
        int arr[] = new int[]{1, 2, 3, -5};
        Assert.assertEquals(6, Subset.sumSemiFast(arr));
    }

    @Test
    public void testSubArrayFrontFast(){
        int arr[] = new int[]{1, 2, 3, -5};
        Assert.assertEquals(6, Subset.sumFast(arr));
    }

    @Test
    public void testSubArrayMiddleSlow(){
        int arr[] = new int[]{1, -2, 3, -5};
        Assert.assertEquals(3, Subset.sumSlow(arr));
    }

    @Test
    public void testSubArrayMiddleMid(){
        int arr[] = new int[]{1, -2, 3, -5};
        Assert.assertEquals(3, Subset.sumSemiFast(arr));
    }

    @Test
    public void testSubArrayMiddleFast(){
        int arr[] = new int[]{1, -2, 3, -5};
        Assert.assertEquals(3, Subset.sumFast(arr));
    }

    @Test
    public void testSubArrayEndSlow(){
        int arr[] = new int[]{1, -2, 3, 10};
        Assert.assertEquals(13, Subset.sumSlow(arr));
    }

    @Test
    public void testSubArrayEndMid(){
        int arr[] = new int[]{1, -2, 3, 10};
        Assert.assertEquals(13, Subset.sumSemiFast(arr));
    }

    @Test
    public void testSubArrayEndFast(){
        int arr[] = new int[]{1, -2, 3, 10};
        Assert.assertEquals(13, Subset.sumFast(arr));
    }

    @Test
    public void testSubArrayNegativeSlow(){
        int arr[] = new int[]{0, -2, -3, -10};
        Assert.assertEquals(0, Subset.sumSlow(arr));
    }

    @Test
    public void testSubArrayNegativeMid(){
        int arr[] = new int[]{0, -2, -3, -10};
        Assert.assertEquals(0, Subset.sumSemiFast(arr));
    }

    @Test
    public void testSubArrayNegativeFast(){
        int arr[] = new int[]{0, -2, -3, -10};
        Assert.assertEquals(0, Subset.sumFast(arr));
    }

}
