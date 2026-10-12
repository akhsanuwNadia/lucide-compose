package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Loader") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.200000762939453,7.800000190734863)
                lineTo(19.100000381469727,4.900000095367432)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,12.0)
                lineTo(22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.200000762939453,16.200000762939453)
                lineTo(19.100000381469727,19.100000381469727)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,18.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.900000095367432,19.100000381469727)
                lineTo(7.800000190734863,16.200000762939453)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(6.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.900000095367432,4.900000095367432)
                lineTo(7.800000190734863,7.800000190734863)
            }
}

public val LucideIcons.All.LoaderDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Loader: ImageVector
    @Composable get() = LoaderDefinition.asImageVector()
