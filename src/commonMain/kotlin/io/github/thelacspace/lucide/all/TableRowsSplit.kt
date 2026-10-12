package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TableRowsSplit") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,10.0)
                lineTo(16.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,22.0)
                lineTo(15.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,2.0)
                lineTo(15.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,10.0)
                lineTo(4.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,10.0)
                lineTo(22.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,19.0)
                lineTo(21.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,22.0)
                lineTo(3.0,16.0)
                curveTo(3.0,14.895430564880371,3.895430564880371,14.0,5.0,14.0)
                lineTo(19.0,14.0)
                curveTo(20.104570388793945,14.0,21.0,14.895430564880371,21.0,16.0)
                lineTo(21.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,2.0)
                lineTo(3.0,4.0)
                curveTo(3.0,5.104569435119629,3.895430564880371,6.0,5.0,6.0)
                lineTo(19.0,6.0)
                curveTo(20.104570388793945,6.0,21.0,5.104569435119629,21.0,4.0)
                lineTo(21.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,10.0)
                lineTo(10.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,22.0)
                lineTo(9.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,2.0)
                lineTo(9.0,6.0)
            }
}

public val LucideIcons.All.TableRowsSplitDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TableRowsSplit: ImageVector
    @Composable get() = TableRowsSplitDefinition.asImageVector()
