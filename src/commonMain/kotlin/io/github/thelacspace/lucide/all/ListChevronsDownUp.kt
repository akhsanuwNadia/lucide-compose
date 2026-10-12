package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListChevronsDownUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                lineTo(11.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                lineTo(11.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,19.0)
                lineTo(11.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,5.0)
                lineTo(18.0,8.0)
                lineTo(21.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,19.0)
                lineTo(18.0,16.0)
                lineTo(21.0,19.0)
            }
}

public val LucideIcons.All.ListChevronsDownUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListChevronsDownUp: ImageVector
    @Composable get() = ListChevronsDownUpDefinition.asImageVector()
