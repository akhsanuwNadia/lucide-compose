package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sofa") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0f,9.0f)
                lineTo(20.0f,6.0f)
                curveTo(20.0f,4.8954306f,19.10457f,4.0f,18.0f,4.0f)
                lineTo(6.0f,4.0f)
                curveTo(4.8954306f,4.0f,4.0f,4.8954306f,4.0f,6.0f)
                lineTo(4.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,16.0f)
                curveTo(2.0f,17.10457f,2.8954306f,18.0f,4.0f,18.0f)
                lineTo(20.0f,18.0f)
                curveTo(21.10457f,18.0f,22.0f,17.10457f,22.0f,16.0f)
                lineTo(22.0f,11.0f)
                curveTo(21.995075f,9.898922f,21.10109f,9.0089245f,20.0f,9.0089245f)
                curveTo(18.89891f,9.0089245f,18.004925f,9.898922f,18.0f,11.0f)
                lineTo(18.0f,12.5f)
                curveTo(18.0f,12.776142f,17.776142f,13.0f,17.5f,13.0f)
                lineTo(6.5f,13.0f)
                curveTo(6.2238574f,13.0f,6.0f,12.776142f,6.0f,12.5f)
                lineTo(6.0f,11.0f)
                curveTo(5.9950757f,9.898922f,5.101089f,9.0089245f,4.0f,9.0089245f)
                curveTo(2.8989108f,9.0089245f,2.0049243f,9.898922f,2.0f,11.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,18.0f)
                lineTo(4.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,18.0f)
                lineTo(20.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,4.0f)
                lineTo(12.0f,13.0f)
            }
}

public val LucideIcons.All.SofaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sofa: ImageVector
    @Composable get() = SofaDefinition.asImageVector()
