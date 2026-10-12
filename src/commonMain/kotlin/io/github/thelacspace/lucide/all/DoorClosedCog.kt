package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DoorClosedCog") { strokeWidth ->
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
                moveTo(19f, 10.35f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, Hf)
                arcToRelative(7f, af, 2f, false, false, 00f, -2f)
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
                moveTo(2f, 21f)
                horizontalLineToRelative(8.58f)
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
                moveTo(9f, 12f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.DoorClosedCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DoorClosedCog: ImageVector
    @Composable get() = DoorClosedCogDefinition.asImageVector()
