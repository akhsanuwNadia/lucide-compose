package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageCircleOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.93f,4.929f)
                curveTo(1.9242615f,7.9345155f,1.1469554f,12.511718f,2.9919999f,16.341f)
                curveTo(3.139039f,16.711914f,3.1717753f,17.118332f,3.086f,17.508f)
                lineTo(2.021f,20.798f)
                curveTo(1.9512302f,21.137228f,2.0619497f,21.488405f,2.313667f,21.726274f)
                curveTo(2.5653846f,21.964142f,2.9222586f,22.054834f,3.257f,21.966f)
                lineTo(6.67f,20.968f)
                curveTo(7.037716f,20.895063f,7.4185286f,20.92694f,7.769f,21.06f)
                curveTo(11.57975f,22.839691f,16.096792f,22.044752f,19.071f,19.071f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.35f,2.69f)
                curveTo(12.049881f,1.2449359f,16.254269f,2.1266472f,19.061861f,4.9364076f)
                curveTo(21.869453f,7.7461686f,22.74792f,11.951235f,21.3f,15.65f)
            }
}

public val LucideIcons.All.MessageCircleOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageCircleOff: ImageVector
    @Composable get() = MessageCircleOffDefinition.asImageVector()
