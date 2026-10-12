package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Newspaper") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,18.0f)
                lineTo(10.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,14.0f)
                lineTo(10.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,22.0f)
                lineTo(20.0f,22.0f)
                curveTo(21.10457f,22.0f,22.0f,21.10457f,22.0f,20.0f)
                lineTo(22.0f,4.0f)
                curveTo(22.0f,2.8954306f,21.10457f,2.0f,20.0f,2.0f)
                lineTo(8.0f,2.0f)
                curveTo(6.8954306f,2.0f,6.0f,2.8954306f,6.0f,4.0f)
                lineTo(6.0f,20.0f)
                curveTo(5.9950757f,21.101078f,5.101089f,21.991076f,4.0f,21.991076f)
                curveTo(2.8989108f,21.991076f,2.0049243f,21.101078f,2.0f,20.0f)
                lineTo(2.0f,11.0f)
                curveTo(2.0f,9.895431f,2.8954306f,9.0f,4.0f,9.0f)
                lineTo(6.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,6.0f)
                lineTo(17.0f,6.0f)
                lineTo(18.0f,6.0f)
                lineTo(18.0f,10.0f)
                lineTo(17.0f,10.0f)
                lineTo(11.0f,10.0f)
                lineTo(10.0f,10.0f)
                lineTo(10.0f,6.0f)
                lineTo(11.0f,6.0f)
                close()
            }
}

public val LucideIcons.All.NewspaperDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Newspaper: ImageVector
    @Composable get() = NewspaperDefinition.asImageVector()
