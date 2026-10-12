package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RefreshCw") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                curveTo(3.0,7.029437065124512,7.029437065124512,3.0,12.0,3.0)
                curveTo(14.516048431396484,3.009464979171753,16.9310302734375,3.9912235736846924,18.739999771118164,5.739999771118164)
                lineTo(21.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,3.0)
                lineTo(21.0,8.0)
                lineTo(16.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,12.0)
                curveTo(21.0,16.970561981201172,16.970561981201172,21.0,12.0,21.0)
                curveTo(9.483951568603516,20.990535736083984,7.068969249725342,20.00877571105957,5.260000228881836,18.260000228881836)
                lineTo(3.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,16.0)
                lineTo(3.0,16.0)
                lineTo(3.0,21.0)
            }
}

public val LucideIcons.All.RefreshCwDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RefreshCw: ImageVector
    @Composable get() = RefreshCwDefinition.asImageVector()
