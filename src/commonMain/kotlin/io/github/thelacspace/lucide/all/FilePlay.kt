package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FilePlay") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,22.0f)
                curveTo(4.8954306f,22.0f,4.0f,21.10457f,4.0f,20.0f)
                lineTo(4.0f,4.0f)
                curveTo(4.0f,2.8954306f,4.8954306f,2.0f,6.0f,2.0f)
                lineTo(14.0f,2.0f)
                curveTo(14.639365f,1.9989636f,15.252715f,2.2530863f,15.704f,2.7059999f)
                lineTo(19.292f,6.2939997f)
                curveTo(19.74614f,6.745444f,20.00104f,7.3596535f,20.0f,8.0f)
                lineTo(20.0f,20.0f)
                curveTo(20.0f,21.10457f,19.10457f,22.0f,18.0f,22.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,7.5522847f,14.447715f,8.0f,15.0f,8.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.033f,13.44f)
                curveTo(15.232872f,13.555658f,15.355949f,13.769076f,15.355949f,14.0f)
                curveTo(15.355949f,14.230923f,15.232872f,14.444341f,15.033f,14.559999f)
                lineTo(10.968f,16.911999f)
                curveTo(10.7681875f,17.027601f,10.521828f,17.027605f,10.322012f,16.912008f)
                curveTo(10.122195f,16.796412f,9.999391f,16.582844f,10.0f,16.352f)
                lineTo(10.0f,11.647999f)
                curveTo(9.999598f,11.417464f,10.122266f,11.204243f,10.321762f,11.088713f)
                curveTo(10.521258f,10.973182f,10.767248f,10.972909f,10.967f,11.087998f)
                close()
            }
}

public val LucideIcons.All.FilePlayDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FilePlay: ImageVector
    @Composable get() = FilePlayDefinition.asImageVector()
