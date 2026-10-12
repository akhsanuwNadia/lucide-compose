package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BriefcaseConveyorBelt") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,20.0f)
                lineTo(10.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,20.0f)
                lineTo(14.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,20.0f)
                lineTo(18.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,20.0f)
                lineTo(3.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,20.0f)
                lineTo(6.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,16.0f)
                lineTo(8.0f,4.0f)
                curveTo(8.0f,2.8954306f,8.895431f,2.0f,10.0f,2.0f)
                lineTo(14.0f,2.0f)
                curveTo(15.104569f,2.0f,16.0f,2.8954306f,16.0f,4.0f)
                lineTo(16.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,6.0f)
                lineTo(18.0f,6.0f)
                lineTo(20.0f,6.0f)
                lineTo(20.0f,16.0f)
                lineTo(18.0f,16.0f)
                lineTo(6.0f,16.0f)
                lineTo(4.0f,16.0f)
                lineTo(4.0f,6.0f)
                lineTo(6.0f,6.0f)
                close()
            }
}

public val LucideIcons.All.BriefcaseConveyorBeltDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BriefcaseConveyorBelt: ImageVector
    @Composable get() = BriefcaseConveyorBeltDefinition.asImageVector()
