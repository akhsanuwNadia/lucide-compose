package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LampDesk") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.293f,2.293f)
                curveTo(10.6835f,1.9026177f,11.316501f,1.9026177f,11.707001f,2.293f)
                lineTo(14.207001f,4.793f)
                lineTo(20.201f,6.0200005f)
                curveTo(20.561502f,6.0939083f,20.85228f,6.3598437f,20.958004f,6.712329f)
                curveTo(21.06373f,7.064814f,20.967314f,7.4468846f,20.707f,7.7070007f)
                lineTo(13.707001f,14.707001f)
                curveTo(13.446885f,14.967315f,13.064815f,15.063729f,12.712329f,14.958005f)
                curveTo(12.359844f,14.852281f,12.093908f,14.561502f,12.02f,14.201001f)
                lineTo(10.793f,8.207001f)
                lineTo(8.293f,5.7070007f)
                curveTo(7.9026184f,5.3165007f,7.9026184f,4.683501f,8.293f,4.2930007f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.207f,4.793f)
                lineTo(10.792999f,8.207001f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,20.0f)
                curveTo(3.0f,18.89543f,3.8954306f,18.0f,5.0f,18.0f)
                lineTo(9.0f,18.0f)
                curveTo(10.104569f,18.0f,11.0f,18.89543f,11.0f,20.0f)
                lineTo(11.0f,21.0f)
                curveTo(11.0f,21.552284f,10.552285f,22.0f,10.0f,22.0f)
                lineTo(4.0f,22.0f)
                curveTo(3.4477153f,22.0f,3.0f,21.552284f,3.0f,21.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.086f,6.5f)
                lineTo(4.293f,11.293f)
                curveTo(3.9838176f,11.601785f,3.9109292f,12.075561f,4.1130004f,12.463f)
                lineTo(7.0f,18.0f)
            }
}

public val LucideIcons.All.LampDeskDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LampDesk: ImageVector
    @Composable get() = LampDeskDefinition.asImageVector()
