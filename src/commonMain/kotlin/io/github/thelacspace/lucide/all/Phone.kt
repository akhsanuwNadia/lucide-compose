package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Phone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.832f,16.568f)
                curveTo(14.257413f,16.763372f,14.761431f,16.637472f,15.045f,16.265001f)
                lineTo(15.4f,15.800001f)
                curveTo(15.777708f,15.296389f,16.370485f,15.0f,17.0f,15.0f)
                lineTo(20.0f,15.0f)
                curveTo(21.10457f,15.0f,22.0f,15.895431f,22.0f,17.0f)
                lineTo(22.0f,20.0f)
                curveTo(22.0f,21.10457f,21.10457f,22.0f,20.0f,22.0f)
                curveTo(10.058874f,22.0f,2.0f,13.941126f,2.0f,4.0f)
                curveTo(2.0f,2.8954306f,2.8954306f,2.0f,4.0f,2.0f)
                lineTo(7.0f,2.0f)
                curveTo(8.104569f,2.0f,9.0f,2.8954306f,9.0f,4.0f)
                lineTo(9.0f,7.0f)
                curveTo(9.0f,7.6295147f,8.703611f,8.222292f,8.2f,8.6f)
                lineTo(7.732f,8.951f)
                curveTo(7.353473f,9.240028f,7.2313027f,9.755904f,7.44f,10.184f)
                curveTo(8.806681f,12.959867f,11.054425f,15.204797f,13.832001f,16.568f)
            }
}

public val LucideIcons.All.PhoneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Phone: ImageVector
    @Composable get() = PhoneDefinition.asImageVector()
