package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HourglassCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(14.305f, 19.53f)
                lineToRelative(.923f, -.382f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15.228f, 16.852f)
                lineToRelative(-.923f, -.383f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.852f, 15.228f)
                lineToRelative(-.383f, -.923f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.852f, 20.772f)
                lineToRelative(-.383f, .924f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 2f)
                verticalLineToRelative(4.172f)
                arcToRelative(2f, 2f, 0f, false, true, -.586f, 1.414f)
                lineToRelative(-8.828f, 8.828f)
                arcTo(2f, 2f, 0f, false, false, 7f, 17.828f)
                verticalLineTo(22f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19.148f, 15.228f)
                lineToRelative(.383f, -.923f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19.53f, 21.696f)
                lineToRelative(-.382f, -.924f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.772f, 16.852f)
                lineToRelative(.924f, -.383f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.772f, 19.148f)
                lineToRelative(.924f, .383f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 22f)
                horizontalLineToRelative(6.159f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 2f)
                horizontalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 2f)
                verticalLineToRelative(4.172f)
                arcToRelative(2f, 2f, 0f, false, false, .586f, 1.414f)
                lineToRelative(5.188f, 5.188f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.HourglassCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HourglassCog: ImageVector
    @Composable get() = HourglassCogDefinition.asImageVector()
