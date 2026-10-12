package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookLock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,6.0f)
                lineTo(18.0f,4.0f)
                curveTo(18.003204f,3.283338f,17.62271f,2.6197395f,17.00259f,2.2604802f)
                curveTo(16.382473f,1.9012209f,15.617528f,1.9012209f,14.997409f,2.2604802f)
                curveTo(14.377291f,2.6197395f,13.996795f,3.283338f,14.0f,4.0f)
                lineTo(14.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,15.0f)
                lineTo(20.0f,21.0f)
                curveTo(20.0f,21.552284f,19.552284f,22.0f,19.0f,22.0f)
                lineTo(6.5f,22.0f)
                curveTo(5.1236525f,21.993845f,4.0111556f,20.876362f,4.0111556f,19.5f)
                curveTo(4.0111556f,18.123638f,5.1236525f,17.006155f,6.5f,17.0f)
                lineTo(20.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,19.5f)
                lineTo(4.0f,4.5f)
                curveTo(4.0f,3.1192882f,5.119288f,2.0f,6.5f,2.0f)
                lineTo(10.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,6.0f)
                lineTo(19.0f,6.0f)
                lineTo(20.0f,6.0f)
                lineTo(20.0f,11.0f)
                lineTo(19.0f,11.0f)
                lineTo(13.0f,11.0f)
                lineTo(12.0f,11.0f)
                lineTo(12.0f,6.0f)
                lineTo(13.0f,6.0f)
                close()
            }
}

public val LucideIcons.All.BookLockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookLock: ImageVector
    @Composable get() = BookLockDefinition.asImageVector()
