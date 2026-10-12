package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareDashedMousePointer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.034000396728516,12.680999755859375)
                curveTo(11.96031665802002,12.496147155761719,12.003752708435059,12.285175323486328,12.144464492797852,12.144463539123535)
                curveTo(12.285176277160645,12.003751754760742,12.496148109436035,11.960315704345703,12.681000709533691,12.0339994430542)
                lineTo(21.680999755859375,15.5339994430542)
                curveTo(21.878753662109375,15.611271858215332,22.00614356994629,15.805009841918945,21.99871826171875,16.017194747924805)
                curveTo(21.99129295349121,16.229381561279297,21.850671768188477,16.413740158081055,21.647998809814453,16.476999282836914)
                lineTo(18.203998565673828,17.545000076293945)
                curveTo(17.88852310180664,17.64253807067871,17.641536712646484,17.889524459838867,17.54399871826172,18.204999923706055)
                lineTo(16.476999282836914,21.648000717163086)
                curveTo(16.413740158081055,21.85067367553711,16.229381561279297,21.991294860839844,16.017194747924805,21.998720169067383)
                curveTo(15.805009841918945,22.006145477294922,15.611271858215332,21.878755569458008,15.5339994430542,21.681001663208008)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                curveTo(3.895430564880371,3.0,3.0,3.895430564880371,3.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,3.0)
                curveTo(20.104570388793945,3.0,21.0,3.895430564880371,21.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,3.0)
                lineTo(10.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,21.0)
                lineTo(11.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,3.0)
                lineTo(15.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,9.0)
                lineTo(3.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,9.0)
                lineTo(21.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,14.0)
                lineTo(3.0,15.0)
            }
}

public val LucideIcons.All.SquareDashedMousePointerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareDashedMousePointer: ImageVector
    @Composable get() = SquareDashedMousePointerDefinition.asImageVector()
