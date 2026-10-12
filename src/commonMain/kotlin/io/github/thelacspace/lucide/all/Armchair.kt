package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Armchair") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0f,9.0f)
                lineTo(19.0f,6.0f)
                curveTo(19.0f,4.8954306f,18.10457f,4.0f,17.0f,4.0f)
                lineTo(7.0f,4.0f)
                curveTo(5.8954306f,4.0f,5.0f,4.8954306f,5.0f,6.0f)
                lineTo(5.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,16.0f)
                curveTo(3.0f,17.10457f,3.8954306f,18.0f,5.0f,18.0f)
                lineTo(19.0f,18.0f)
                curveTo(20.10457f,18.0f,21.0f,17.10457f,21.0f,16.0f)
                lineTo(21.0f,11.0f)
                curveTo(20.995075f,9.898922f,20.10109f,9.0089245f,19.0f,9.0089245f)
                curveTo(17.89891f,9.0089245f,17.004925f,9.898922f,17.0f,11.0f)
                lineTo(17.0f,12.5f)
                curveTo(17.0f,12.776142f,16.776142f,13.0f,16.5f,13.0f)
                lineTo(7.5f,13.0f)
                curveTo(7.2238574f,13.0f,7.0f,12.776142f,7.0f,12.5f)
                lineTo(7.0f,11.0f)
                curveTo(6.9950757f,9.898922f,6.101089f,9.0089245f,5.0f,9.0089245f)
                curveTo(3.8989108f,9.0089245f,3.0049243f,9.898922f,3.0f,11.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,18.0f)
                lineTo(5.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,18.0f)
                lineTo(19.0f,20.0f)
            }
}

public val LucideIcons.All.ArmchairDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Armchair: ImageVector
    @Composable get() = ArmchairDefinition.asImageVector()
