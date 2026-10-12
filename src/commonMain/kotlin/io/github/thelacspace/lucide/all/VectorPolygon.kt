package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VectorPolygon") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(12.828f, 4.813f)
                lineToRelative(5.344f, 2.375f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15.769f, 18.153f)
                lineToRelative(3.461f, -8.306f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5.687f, 14.074f)
                lineToRelative(7.625f, 4.852f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.772f, 5.579f)
                lineTo(5.228f, 11.42f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.VectorPolygonDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VectorPolygon: ImageVector
    @Composable get() = VectorPolygonDefinition.asImageVector()
