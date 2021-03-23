package com.gosia.drawshapes

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class CanvasView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val paint: Paint = Paint()
        paint.setColor(Color.MAGENTA)
        paint.strokeWidth = 13f
        canvas?.drawLine(200f, 200f,800f, 800f, paint)
        paint.setColor(Color.BLUE)
        paint.strokeWidth = 5f
        canvas?.drawLine(0f, 800f,200f, 500f, paint)
        paint.setColor(Color.RED)
        paint.strokeWidth = 8f
        canvas?.drawLine(000f, 1400f,200f, 0f, paint)

        paint.setColor(Color.RED)
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 10f
        canvas?.drawCircle(900f, 200f, 100f,paint)
        paint.setColor(Color.YELLOW)
        paint.strokeWidth = 10f
        canvas?.drawCircle(400f, 600f, 200f,paint)
        paint.style = Paint.Style.FILL
        paint.setColor(Color.GRAY)
        canvas?.drawCircle(400f, 600f, 200f,paint)
        paint.setColor(Color.GREEN)
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 10f
        canvas?.drawCircle(700f, 900f, 500f,paint)


        val path: Path = Path()
        path.moveTo(300f,1800f,)
        path.lineTo(500f, 1200f)
        path.lineTo(100f, 1100f)
        path.close()
        paint.setColor(Color.DKGRAY)
        paint.style = Paint.Style.STROKE
        canvas?.drawPath(path, paint)
        paint.setColor(Color.RED)
        paint.style = Paint.Style.FILL
        canvas?.drawPath(path, paint)

        path.moveTo(900f,600f,)
        path.lineTo(1000f, 1400f)
        path.lineTo(200f, 800f)
        path.close()
        paint.setColor(Color.BLUE)
        paint.style = Paint.Style.STROKE
        canvas?.drawPath(path, paint)
        paint.setColor(Color.MAGENTA)
        paint.style = Paint.Style.FILL




    }
}