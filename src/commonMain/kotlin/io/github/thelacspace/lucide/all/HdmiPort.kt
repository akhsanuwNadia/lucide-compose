package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HdmiPort") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,9.0f)
                curveTo(22.0f,8.447715f,21.552284f,8.0f,21.0f,8.0f)
                lineTo(3.0f,8.0f)
                curveTo(2.4477153f,8.0f,2.0f,8.447715f,2.0f,9.0f)
                lineTo(2.0f,13.0f)
                curveTo(2.0f,13.552285f,2.4477153f,14.0f,3.0f,14.0f)
                lineTo(3.5f,14.0f)
                curveTo(4.1295147f,14.0f,4.722291f,14.296389f,5.1f,14.8f)
                lineTo(5.4f,15.2f)
                curveTo(5.777709f,15.703611f,6.3704853f,16.0f,7.0f,16.0f)
                lineTo(17.0f,16.0f)
                curveTo(17.629515f,16.0f,18.222292f,15.703611f,18.6f,15.2f)
                lineTo(18.9f,14.8f)
                curveTo(19.277708f,14.296389f,19.870485f,14.0f,20.5f,14.0f)
                lineTo(21.0f,14.0f)
                curveTo(21.552284f,14.0f,22.0f,13.552285f,22.0f,13.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                lineTo(16.0f,12.0f)
            }
}

public val LucideIcons.All.HdmiPortDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HdmiPort: ImageVector
    @Composable get() = HdmiPortDefinition.asImageVector()
