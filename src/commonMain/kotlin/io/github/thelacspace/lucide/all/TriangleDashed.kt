package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TriangleDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.170000076293945,4.192999839782715)
                curveTo(10.490690231323242,3.465301752090454,11.21203327178955,2.996730089187622,12.007255554199219,2.9995498657226562)
                curveTo(12.802477836608887,3.0023698806762695,13.520479202270508,3.476045846939087,13.836000442504883,4.205999851226807)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,21.0)
                lineTo(16.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.87399959564209,7.743000030517578)
                lineTo(16.874000549316406,9.475000381469727)
            }
            lucidePath(strokeWidth) {
                moveTo(18.849000930786133,12.95199966430664)
                lineTo(19.849000930786133,14.684000015258789)
            }
            lucidePath(strokeWidth) {
                moveTo(21.823999404907227,18.18000030517578)
                curveTo(22.10481071472168,18.801010131835938,22.050048828125,19.52227210998535,21.678699493408203,20.093767166137695)
                curveTo(21.307348251342773,20.66526222229004,20.6705322265625,21.008310317993164,19.988998413085938,21.003999710083008)
            }
            lucidePath(strokeWidth) {
                moveTo(4.02400016784668,21.0)
                curveTo(3.337613821029663,21.00808334350586,2.695037603378296,20.663599014282227,2.321845531463623,20.087474822998047)
                curveTo(1.9486534595489502,19.511350631713867,1.8969932794570923,18.78409194946289,2.18500018119812,18.160999298095703)
            }
            lucidePath(strokeWidth) {
                moveTo(5.136000156402588,12.95199966430664)
                lineTo(4.136000156402588,14.684000015258789)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,21.0)
                lineTo(10.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.10200023651123,7.743000030517578)
                lineTo(7.1020002365112305,9.475000381469727)
            }
}

public val LucideIcons.All.TriangleDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TriangleDashed: ImageVector
    @Composable get() = TriangleDashedDefinition.asImageVector()
