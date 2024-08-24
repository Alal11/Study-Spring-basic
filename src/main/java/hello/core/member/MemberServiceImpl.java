package hello.core.member;

public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepositoty;

    public MemberServiceImpl(MemberRepository memberRepositoty) {
        this.memberRepositoty = memberRepositoty;
    }

    @Override
    public void join(Member member) {
        memberRepositoty.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepositoty.findById(memberId);
    }
}
