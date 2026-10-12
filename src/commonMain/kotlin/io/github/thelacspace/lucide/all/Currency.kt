package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Currency") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,12.0f)
                curveTo(3.98718f,14.866648f,5.5091615f,17.521042f,7.9896364f,18.958078f)
                curveTo(10.470112f,20.395117f,13.529888f,20.395117f,16.010363f,18.958078f)
                curveTo(18.490839f,17.521042f,20.01282f,14.866648f,20.0f,12.0f)
                curveTo(20.01282f,9.133352f,18.490839f,6.478958f,16.010363f,5.0419207f)
                curveTo(13.529888f,3.6048834f,10.470112f,3.6048834f,7.9896364f,5.0419207f)
                curveTo(5.5091615f,6.478958f,3.98718f,9.133352f,4.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,3.0f)
                lineTo(6.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,3.0f)
                lineTo(18.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,21.0f)
                lineTo(6.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,21.0f)
                lineTo(18.0f,18.0f)
            }
}

public val LucideIcons.All.CurrencyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Currency: ImageVector
    @Composable get() = CurrencyDefinition.asImageVector()
