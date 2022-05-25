class Solution {
    boolean isRectangleIntersect(int ax1,int ay1,int ax2,int ay2,int bx1,int by1,int bx2,int by2){
        if(ay1>=by2||by1>=ay2||ax2<=bx1||bx2<ax1) return false;
        return true;
    }
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int l=Math.abs(ax2-ax1)*Math.abs(ay2-ay1);
        int r=Math.abs(bx2-bx1)*Math.abs(by2-by1);
        if(isRectangleIntersect(ax1, ay1,ax2, ay2, bx1, by1, bx2, by2)){
            return (l+r-(Math.min(ax2,bx2)-Math.max(ax1,bx1))*(Math.min(by2,ay2)-Math.max(ay1,by1)));
        }else{
            return (int)l+(int)r;
        }
       /* return ((int)l+(int)r-(Math.max(Math.min(ax2,bx2)-Math.max(ax1,bx1),0)*Math.max(Math.min(by2,ay2)-Math.max(ay1,by1),0)));*/
    }
}