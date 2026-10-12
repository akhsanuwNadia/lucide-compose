package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TypeOutline") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,16.5f)
                curveTo(14.0f,16.776142f,14.223858f,17.0f,14.5f,17.0f)
                lineTo(15.0f,17.0f)
                curveTo(16.101078f,17.004925f,16.991076f,17.89891f,16.991076f,19.0f)
                curveTo(16.991076f,20.10109f,16.101078f,20.995075f,15.0f,21.0f)
                lineTo(9.0f,21.0f)
                curveTo(7.898922f,20.995075f,7.0089245f,20.10109f,7.0089245f,19.0f)
                curveTo(7.0089245f,17.89891f,7.898922f,17.004925f,9.0f,17.0f)
                lineTo(9.5f,17.0f)
                curveTo(9.776142f,17.0f,10.0f,16.776142f,10.0f,16.5f)
                lineTo(10.0f,7.5f)
                curveTo(10.0f,7.2238574f,9.776142f,7.0f,9.5f,7.0f)
                lineTo(6.5f,7.0f)
                curveTo(6.2238574f,7.0f,6.0f,7.2238574f,6.0f,7.5f)
                lineTo(6.0f,8.0f)
                curveTo(5.9950757f,9.101078f,5.101089f,9.9910755f,4.0f,9.9910755f)
                curveTo(2.8989108f,9.9910755f,2.0049243f,9.101078f,2.0f,8.0f)
                lineTo(2.0f,5.0f)
                curveTo(2.0f,3.8954306f,2.8954306f,3.0f,4.0f,3.0f)
                lineTo(20.0f,3.0f)
                curveTo(21.10457f,3.0f,22.0f,3.8954306f,22.0f,5.0f)
                lineTo(22.0f,8.0f)
                curveTo(21.995075f,9.101078f,21.10109f,9.9910755f,20.0f,9.9910755f)
                curveTo(18.89891f,9.9910755f,18.004925f,9.101078f,18.0f,8.0f)
                lineTo(18.0f,7.5f)
                curveTo(18.0f,7.2238574f,17.776142f,7.0f,17.5f,7.0f)
                lineTo(14.5f,7.0f)
                curveTo(14.223858f,7.0f,14.0f,7.2238574f,14.0f,7.5f)
                close()
            }
}

public val LucideIcons.All.TypeOutlineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TypeOutline: ImageVector
    @Composable get() = TypeOutlineDefinition.asImageVector()
