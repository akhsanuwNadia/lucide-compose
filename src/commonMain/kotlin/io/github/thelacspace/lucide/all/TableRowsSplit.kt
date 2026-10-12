package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TableRowsSplit") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,10.0f)
                lineTo(16.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,22.0f)
                lineTo(15.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,2.0f)
                lineTo(15.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,10.0f)
                lineTo(4.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,10.0f)
                lineTo(22.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,19.0f)
                lineTo(21.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,22.0f)
                lineTo(3.0f,16.0f)
                curveTo(3.0f,14.895431f,3.8954306f,14.0f,5.0f,14.0f)
                lineTo(19.0f,14.0f)
                curveTo(20.10457f,14.0f,21.0f,14.895431f,21.0f,16.0f)
                lineTo(21.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,2.0f)
                lineTo(3.0f,4.0f)
                curveTo(3.0f,5.1045694f,3.8954306f,6.0f,5.0f,6.0f)
                lineTo(19.0f,6.0f)
                curveTo(20.10457f,6.0f,21.0f,5.1045694f,21.0f,4.0f)
                lineTo(21.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,10.0f)
                lineTo(10.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,22.0f)
                lineTo(9.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,2.0f)
                lineTo(9.0f,6.0f)
            }
}

public val LucideIcons.All.TableRowsSplitDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TableRowsSplit: ImageVector
    @Composable get() = TableRowsSplitDefinition.asImageVector()
