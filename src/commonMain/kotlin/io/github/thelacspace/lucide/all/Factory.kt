package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Factory") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,16.0f)
                lineTo(12.01f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,16.0f)
                lineTo(16.01f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(19.0f,21.0f)
                curveTo(20.10457f,21.0f,21.0f,20.10457f,21.0f,19.0f)
                lineTo(21.0f,8.5f)
                curveTo(21.000193f,8.317296f,20.900717f,8.149034f,20.740543f,8.061136f)
                curveTo(20.580372f,7.97324f,20.385012f,7.9797053f,20.231f,8.078f)
                lineTo(15.769001f,10.922f)
                curveTo(15.614991f,11.020296f,15.419629f,11.026762f,15.259457f,10.938865f)
                curveTo(15.099284f,10.850968f,14.999807f,10.682705f,15.0f,10.5f)
                lineTo(15.0f,8.5f)
                curveTo(15.000193f,8.317295f,14.900716f,8.149033f,14.740543f,8.061136f)
                curveTo(14.580372f,7.973239f,14.38501f,7.979705f,14.231f,8.078f)
                lineTo(9.77f,10.922f)
                curveTo(9.615949f,11.020838f,9.420203f,11.027603f,9.259695f,10.939637f)
                curveTo(9.099188f,10.85167f,8.999572f,10.683032f,9.0f,10.5f)
                lineTo(9.0f,5.0f)
                curveTo(9.0f,3.8954306f,8.104569f,3.0f,7.0f,3.0f)
                lineTo(5.0f,3.0f)
                curveTo(3.8954306f,3.0f,3.0f,3.8954306f,3.0f,5.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,16.0f)
                lineTo(8.01f,16.0f)
            }
}

public val LucideIcons.All.FactoryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Factory: ImageVector
    @Composable get() = FactoryDefinition.asImageVector()
