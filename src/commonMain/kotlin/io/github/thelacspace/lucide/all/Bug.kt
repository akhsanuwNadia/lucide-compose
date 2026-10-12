package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bug") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,20.0)
                lineTo(12.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,7.0)
                curveTo(16.209138870239258,7.0,18.0,8.790861129760742,18.0,11.0)
                lineTo(18.0,14.0)
                curveTo(17.985227584838867,17.303234100341797,15.303267478942871,19.97322654724121,12.0,19.97322654724121)
                curveTo(8.696732521057129,19.97322654724121,6.014772415161133,17.303234100341797,6.0,14.0)
                lineTo(6.0,11.0)
                curveTo(6.0,8.790861129760742,7.790861129760742,7.0,10.0,7.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.119999885559082,3.880000114440918)
                lineTo(16.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,21.0)
                curveTo(21.002412796020508,18.86298179626465,19.324607849121094,17.10150718688965,17.190000534057617,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,5.0)
                curveTo(20.997657775878906,7.033257484436035,19.470352172851562,8.741259574890137,17.450000762939453,8.970000267028809)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,13.0)
                lineTo(18.0,13.0)
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
                moveTo(9.0,7.130000114440918)
                lineTo(9.0,6.0)
                curveTo(8.995192527770996,4.925007343292236,9.565935134887695,3.9296092987060547,10.496113777160645,3.3907203674316406)
                curveTo(11.426291465759277,2.8518311977386475,12.573708534240723,2.8518311977386475,13.503886222839355,3.3907203674316406)
                curveTo(14.434064865112305,3.9296092987060547,15.004807472229004,4.925007343292236,15.0,6.0)
                lineTo(15.0,7.130000114440918)
            }
}

public val LucideIcons.All.BugDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bug: ImageVector
    @Composable get() = BugDefinition.asImageVector()
