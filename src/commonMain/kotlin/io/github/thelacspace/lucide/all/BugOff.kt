package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BugOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,20.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.656000137329102,7.0)
                lineTo(14.0,7.0)
                curveTo(16.209138870239258,7.0,18.0,8.790861129760742,18.0,11.0)
                lineTo(18.0,12.343999862670898)
            }
            lucidePath(strokeWidth) {
                moveTo(14.119999885559082,3.880000114440918)
                lineTo(16.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.12299919128418,17.12299919128418)
                curveTo(15.723268508911133,19.418926239013672,12.96695613861084,20.503219604492188,10.378098487854004,19.776348114013672)
                curveTo(7.789241790771484,19.049474716186523,6.000125885009766,16.688962936401367,6.0,14.0)
                lineTo(6.0,11.0)
                curveTo(5.999862194061279,9.688631057739258,6.642520427703857,8.460480690002441,7.720000267028809,7.713000297546387)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,5.0)
                curveTo(20.997657775878906,7.033257484436035,19.470352172851562,8.741259574890137,17.450000762939453,8.970000267028809)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,13.0)
                lineTo(18.6560001373291,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,21.0)
                curveTo(2.9975879192352295,18.86298179626465,4.675393104553223,17.10150718688965,6.809999942779541,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                curveTo(3.0023417472839355,7.033257484436035,4.529648780822754,8.741260528564453,6.550000190734863,8.970000267028809)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,13.0)
                lineTo(2.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,2.0)
                lineTo(9.880000114440918,3.880000114440918)
            }
            lucidePath(strokeWidth) {
                moveTo(9.711999893188477,4.059999942779541)
                curveTo(10.525823593139648,3.100376605987549,11.85200309753418,2.7505621910095215,13.033265113830566,3.183929681777954)
                curveTo(14.214526176452637,3.617297410964966,14.999842643737793,4.741752624511719,15.0,6.0)
                lineTo(15.0,7.130000114440918)
            }
}

public val LucideIcons.All.BugOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BugOff: ImageVector
    @Composable get() = BugOffDefinition.asImageVector()
