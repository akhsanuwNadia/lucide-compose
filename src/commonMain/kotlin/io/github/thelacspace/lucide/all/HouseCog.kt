package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HouseCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.584f, 21f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, true, false, -2f, vf)
                arcToRelative(-9f, af, 2f, false, false, 01.709f, -1.527f)
                lineToRelative(7f, -6f)
                arcToRelative(2f, 2f, 0f, false, false, lf, 7f)
                arcToRelative(6f, Af, 2f, false, false, 0121f, 10.001f)
                verticalLineToRelative(.583f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 12f)
                horizontalLineTo(10f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, vf)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.305f, 19.53f)
                lineToRelative(.923f, -.382f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15.229f, 16.852f)
                lineToRelative(-.924f, -.383f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.852f, 15.228f)
                lineToRelative(-.383f, -.923f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.852f, 20.773f)
                lineToRelative(-.383f, .924f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19.148f, 15.228f)
                lineToRelative(.383f, -.923f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19.53f, 21.697f)
                lineToRelative(-.382f, -.924f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.773f, 16.852f)
                lineToRelative(.922f, -.383f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.773f, 19.148f)
                lineToRelative(.922f, .383f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.HouseCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HouseCog: ImageVector
    @Composable get() = HouseCogDefinition.asImageVector()
