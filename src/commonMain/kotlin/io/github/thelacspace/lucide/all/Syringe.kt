package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Syringe") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,2.0f)
                lineTo(22.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,7.0f)
                lineTo(20.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,9.0f)
                lineTo(8.7f,19.3f)
                curveTo(7.7f,20.3f,6.2f,20.3f,5.2999997f,19.3f)
                lineTo(4.7f,18.699999f)
                curveTo(3.6999998f,17.699999f,3.6999998f,16.199999f,4.7f,15.299999f)
                lineTo(15.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,11.0f)
                lineTo(13.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,19.0f)
                lineTo(2.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,4.0f)
                lineTo(20.0f,10.0f)
            }
}

public val LucideIcons.All.SyringeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Syringe: ImageVector
    @Composable get() = SyringeDefinition.asImageVector()
