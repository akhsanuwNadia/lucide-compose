package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Warehouse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,21.0f)
                lineTo(18.0f,10.0f)
                curveTo(18.0f,9.447715f,17.552284f,9.0f,17.0f,9.0f)
                lineTo(7.0f,9.0f)
                curveTo(6.4477153f,9.0f,6.0f,9.447715f,6.0f,10.0f)
                lineTo(6.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,19.0f)
                curveTo(22.0f,20.10457f,21.10457f,21.0f,20.0f,21.0f)
                lineTo(4.0f,21.0f)
                curveTo(2.8954306f,21.0f,2.0f,20.10457f,2.0f,19.0f)
                lineTo(2.0f,8.0f)
                curveTo(1.9995488f,7.2314157f,2.4395726f,6.5305653f,3.132f,6.197f)
                lineTo(11.082f,2.223f)
                curveTo(11.6581135f,1.9251523f,12.342886f,1.9251523f,12.919f,2.223f)
                lineTo(20.867f,6.197f)
                curveTo(21.559816f,6.5302796f,22.000267f,7.2311893f,22.0f,8.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,13.0f)
                lineTo(18.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,17.0f)
                lineTo(18.0f,17.0f)
            }
}

public val LucideIcons.All.WarehouseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Warehouse: ImageVector
    @Composable get() = WarehouseDefinition.asImageVector()
