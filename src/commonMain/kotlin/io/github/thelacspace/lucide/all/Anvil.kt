package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Anvil") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,10.0f)
                lineTo(6.0f,10.0f)
                curveTo(3.790861f,10.0f,2.0f,8.209139f,2.0f,6.0f)
                curveTo(2.0f,5.4477153f,2.4477153f,5.0f,3.0f,5.0f)
                lineTo(7.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,5.0f)
                curveTo(7.0f,4.4477153f,7.4477153f,4.0f,8.0f,4.0f)
                lineTo(21.0f,4.0f)
                curveTo(21.552284f,4.0f,22.0f,4.4477153f,22.0f,5.0f)
                curveTo(22.0f,8.8659935f,18.865993f,12.0f,15.0f,12.0f)
                lineTo(8.0f,12.0f)
                curveTo(7.4477153f,12.0f,7.0f,11.552285f,7.0f,11.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                lineTo(9.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,12.0f)
                lineTo(15.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,20.0f)
                curveTo(5.0f,18.343145f,6.343146f,17.0f,8.0f,17.0f)
                lineTo(16.0f,17.0f)
                curveTo(17.656855f,17.0f,19.0f,18.343145f,19.0f,20.0f)
                curveTo(19.0f,20.552284f,18.552284f,21.0f,18.0f,21.0f)
                lineTo(6.0f,21.0f)
                curveTo(5.4477153f,21.0f,5.0f,20.552284f,5.0f,20.0f)
            }
}

public val LucideIcons.All.AnvilDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Anvil: ImageVector
    @Composable get() = AnvilDefinition.asImageVector()
