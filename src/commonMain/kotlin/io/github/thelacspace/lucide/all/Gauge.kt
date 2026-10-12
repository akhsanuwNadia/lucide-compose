package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Gauge") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,14.0)
                lineTo(16.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.3399999141693115,19.0)
                curveTo(0.9132542014122009,14.797245979309082,1.854383945465088,9.45877742767334,5.571993827819824,6.339224338531494)
                curveTo(9.289604187011719,3.2196717262268066,14.710395812988281,3.2196717262268066,18.42800521850586,6.339224338531494)
                curveTo(22.14561653137207,9.45877742767334,23.086746215820312,14.797245979309082,20.65999984741211,19.0)
            }
}

public val LucideIcons.All.GaugeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Gauge: ImageVector
    @Composable get() = GaugeDefinition.asImageVector()
