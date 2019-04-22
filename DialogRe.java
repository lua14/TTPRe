package TTP;
import android.app.*;
import android.content.*;
import android.graphics.drawable.*;
import android.util.*;
import android.view.*;
/*
 如果带编辑器就继承该对话框
 这个版本可以自定义控件样式，
 */
public class DialogRe extends AlertDialog.Builder
{
 public Window mWindow;
 public AlertDialog mAD;
 public Context mContext;
 public DialogRe(Context context, int layout)
 {
  super(context);
  mContext=context;
  setView(layout);
  //window.setContentView(layout);
 }

 public DialogRe(Context context, int layout,boolean b)
 {
  super(context);
  mContext=context;
  setView(layout);
  setCancelable(b);
 }

 public DialogRe(Context context,String s,String s1)
 {
  //提示用的
  super(context);
  mContext=context;
  setTitle(s);
  setMessage(s1);
 }

 public DialogRe(Context context,String s,String s1,boolean b)
 {
  //提示用的
  super(context);
  mContext=context;
  setTitle(s);
  setMessage(s1);
  setCancelable(b);
 }

 public void 确定按钮(String s){
  setPositiveButton(s, new DialogInterface.OnClickListener(){
	@Override
	public void onClick(DialogInterface p1, int p2)
	{
	 // TODO: Implement this method
	 确定事件();
	}
   });
 }

 public void 确定事件()
 {
  // TODO: Implement this method
 }


 public void 取消按钮(String s){
  setNegativeButton(s, new DialogInterface.OnClickListener(){
	@Override
	public void onClick(DialogInterface p1, int p2)
	{
	 // TODO: Implement this method
	 取消事件();
	}
   });
 }

 public void 取消事件()
 {
  // TODO: Implement this method
 }

 public void 不确定按钮(String s){
  setNeutralButton(s, new DialogInterface.OnClickListener(){
	@Override
	public void onClick(DialogInterface p1, int p2)
	{
	 // TODO: Implement this method
	 不确定事件();
	}
   });
 }

 public void 不确定事件()
 {
  // TODO: Implement this method
 }

 public void 初始化(){
  mAD = show();
  mWindow = mAD.getWindow();
  mWindow.setGravity(Gravity.CENTER);
  //
  WindowManager.LayoutParams wl = mWindow.getAttributes();
  wl.width = (int)(函数.get屏幕宽度()*0.94);
  wl.alpha = 1f;
  wl.gravity =Gravity.CENTER;
  mWindow.setAttributes(wl);
  透明背景();
 }

 public void 透明背景(){
  //透明背景
  mWindow.setBackgroundDrawable(new ColorDrawable(0x00000000));
 }

 public void 背景颜色(int i){
  //透明背景
  mWindow.setBackgroundDrawable(new ColorDrawable(i));
 }

 public void 关闭(){
  mAD.dismiss();
 }

 public void 显示(){
  mAD.show();
 }

 public void 键盘获取焦点(){
  mWindow.clearFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE | WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM); 
  mWindow.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE | WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
 }
 
 public void set宽度(int x){
  WindowManager.LayoutParams wl = mWindow.getAttributes();
  wl.width = x;
  mWindow.setAttributes(wl);
 }
 public void set高度(int x){
  WindowManager.LayoutParams wl = mWindow.getAttributes();
  wl.width = x;
  mWindow.setAttributes(wl);
 }
}

