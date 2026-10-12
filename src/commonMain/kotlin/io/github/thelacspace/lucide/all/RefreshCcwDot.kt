package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RefreshCcwDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,12.0)
                curveTo(21.0,7.029437065124512,16.970561981201172,3.0,12.0,3.0)
                curveTo(9.483951568603516,3.009464979171753,7.068969249725342,3.9912235736846924,5.260000228881836,5.739999771118164)
                lineTo(3.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,3.0)
                lineTo(3.0,8.0)
                lineTo(8.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                curveTo(3.0,16.970561981201172,7.029437065124512,21.0,12.0,21.0)
                curveTo(14.516048431396484,20.990535736083984,16.9310302734375,20.00877571105957,18.739999771118164,18.260000228881836)
                lineTo(21.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,16.0)
                lineTo(21.0,16.0)
                lineTo(21.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,12.0)
                curveTo(10.998397827148438,12.358330726623535,11.188645362854004,12.690130233764648,11.49870491027832,12.869759559631348)
                curveTo(11.80876350402832,13.049389839172363,12.19123649597168,13.049389839172363,12.50129508972168,12.869759559631348)
                curveTo(12.811354637145996,12.690130233764648,13.001602172851562,12.358330726623535,13.0,12.0)
                curveTo(13.001602172851562,11.641669273376465,12.811354637145996,11.309869766235352,12.50129508972168,11.130240440368652)
                curveTo(12.19123649597168,10.950610160827637,11.80876350402832,10.950610160827637,11.49870491027832,11.130240440368652)
                curveTo(11.188645362854004,11.309869766235352,10.998397827148438,11.641669273376465,11.0,12.0)
            }
}

public val LucideIcons.All.RefreshCcwDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RefreshCcwDot: ImageVector
    @Composable get() = RefreshCcwDotDefinition.asImageVector()
